package com.apirest.spring.app_template_basic.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class HomeService implements IHomeService{

    @Override
    public Object ordenarBurbuja(Object values) {

        Map<String, Object> response = new HashMap<>();

        try {
            List<?> datos = (ArrayList<Object>) values;
            response.put("ascendente", ordenarAscendiente(datos));
            response.put("descendente", ordenarDescendente(datos));
        } catch (Exception e) {
            throw e;
        }
        return response;
    }

    private List<?> ordenarAscendiente(List<?> datos){
        Integer[] arreglo = new Integer[datos.size()];
        arreglo = datos.toArray(arreglo);

        List<Object> array = new ArrayList<>();
        for(int i = 0; i < arreglo.length; i++){
            for(int k = 0; k < arreglo.length - i - 1; k++){
                if(arreglo[k] > arreglo[k+1]){
                    int temp = arreglo[k];
                    arreglo[k] = arreglo[k+1];
                    arreglo[k+1] = temp;
                }
            }
         }
        array.add(arreglo);
        return array;
    }

    private List<?> ordenarDescendente(List<?> datos){
        Integer[] arreglo= new Integer[datos.size()];
        arreglo = datos.toArray(arreglo);

        List<Object> array = new ArrayList<>();
        for(int i = 0; i < arreglo.length; i++){
            for(int k = 0; k < arreglo.length - i - 1; k++){
                if(arreglo[k] < arreglo[k+1]){
                    int temp = arreglo[k+1];
                    arreglo[k+1] = arreglo[k];
                    arreglo[k] = temp;
                }
            }
         }
        array.add(arreglo);
        return array;
    }
}
