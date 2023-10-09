public class MetodosString {
    

    public int Logintud(Cadena cadena){
        int aux=0;
        for (int i=0;i<cadena.getX().length();i++){
            aux++;


        }


        return aux;
    }
    public String Invertir(Cadena cadena) {
        String original = cadena.getX();
        String invertida = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }
        return invertida;
    }
    public String SubString(Cadena cadena){
        Numero n=new Numero();
        GetDato ob= new GetDato();
        n.setA(ob.CapturarOpcion());
        return cadena.getX().substring(n.getA());

        


        
    }
    public String SubStrignAcotado(Cadena cadena) {
        Numero n = new Numero();
        GetDato ob = new GetDato();
        
        // Capturar el índice de inicio
        System.out.println("Ingrese la posicion X:");
        n.setA(ob.CapturarOpcion());
    
        // Capturar el índice de finalización
        System.out.println("Ingrese la posicion Y:");
        int indiceFinal = ob.CapturarOpcion();
        
        String cadenaOriginal = cadena.getX();
        /*El primer indice debe ser mayor o igual a cero pero al mismo tiempo tiene que ser menor a la cadena original y el indice final tiene que 
           Ser mayor a cero y ser menor que la cadena original, pero a su vez tiene que ser mayor que el Primer Indice, para que asi podamos 
           Obtener la posicion de inicio y la posicion final de un string en el Acotado */
        if (n.getA() >= 0 && n.getA() < cadenaOriginal.length() &&
            indiceFinal >= 0 && indiceFinal <= cadenaOriginal.length() && n.getA() <= indiceFinal) {
            return cadenaOriginal.substring(n.getA(), indiceFinal);
        } else {
            return "Los índices son inválidos.";
        }
    }
    public char Caracter(Cadena cadena){
        GetDato ob = new GetDato();
         Numero n = new Numero();
        n.setA(ob.CapturarOpcion());
       
        return cadena.getX().charAt(n.getA());

    }

    public String Concatenacion(Cadena cadena) {
        GetDato ob = new GetDato();
        
        // Captura una cadena adicional
        Cadena cadenaAdicional = new Cadena();
        ob.CapturarString(cadenaAdicional);
        
        // Obtén la cadena existente de la instancia 'cadena'
        String a = cadena.getX();
        
        // Obtén la cadena adicional desde la instancia 'cadenaAdicional'
        String b = cadenaAdicional.getX();
        
        // Concatena las dos cadenas utilizando el método 'concat()'
        String resultado = a.concat(b);
        
        return resultado;
    }
    public String CadenaConCadena(Cadena cadena){
        GetDato ob = new GetDato();
        Cadena cadenaAdicional = new Cadena();
        ob.CapturarString(cadenaAdicional);
        String n = cadenaAdicional.getX();
        int posicion = cadena.getX().indexOf(n);
    
        if (posicion != -1) {
            return "La subcadena '" + n + "' comienza en el índice " + posicion;
        } else {
            return "La subcadena '" + n + "' no se encontró en la cadena principal.";
        }
        
    }
    public String igualdad(Cadena cadena){
        GetDato ob = new GetDato();
        Cadena cadenaAdicional = new Cadena();
        ob.CapturarString(cadenaAdicional);
        if(cadena.getX().equals(cadenaAdicional.getX())){
            return "La cadena "+ cadena.getX()+" es igual a la cadena: "+ cadenaAdicional.getX();
        }else{
             return "Las cadenas no son iguales" ;
        }

      
    }
    
    
    
}
