package calculadorabinariosjava;

/**
 *
 * @author Poolker
 */
public class CalculoBi {

    private String bin1;
    private String bin2;
    private int TipoCalculo;

    //Conctructor Vacio
    public CalculoBi() {

    }

    //Conctructor con parametros
    public CalculoBi(String bin1, String bin2) {

        this.bin1 = bin1;
        this.bin2 = bin2;
//        this.TipoCalculo = TipoCalculo;

    }

    public boolean numberValid(String num) {
        boolean valido = true;

        //******************
        //Evaluando decimales solo un "."
        int fin = 0, temp = num.indexOf("."); //Variabl temporal para encuentro del "."
        fin = num.indexOf(".", temp + 1);
        if (fin > 0) {
            valido = false;// en caso de que el numero contenga mas de un "."
        }
        //Fin de Evaluacion de Decimales
        //******************
        char[] bin = num.toCharArray();
        int size = bin.length;

        for (int x = 0; x < size; x++) {
            if (!(bin[x] == '1' || bin[x] == '0' || bin[x] == '.')) {
                valido = false;
                break;
            }
        }

        return valido;
    }

    public String[] Empalme(String b1, String b2) {
        int largo1 = 0, largo2 = 0, empalme = 0;
        largo1 = b1.length();
        largo2 = b2.length();
        //***********************************
        // Aqui tenemos que cuadrar el tamaño de los binarios

        if (largo1 > largo2) {

            //calculo la diferenci entre los dos espacions que hay
            empalme = largo1 - largo2;

            for (; empalme > 0; empalme--) {
                b2 = "0" + b2;
            }

            //Con esto se logra agragar los ceros a la izquierda/
            //La cantidad necesaria
        } else if (largo1 < largo2) {
            empalme = largo2 - largo1;
            for (; empalme > 0; empalme--) {
                b1 = "0" + b1;
            }

        }
        //************************************
        String[] valores = {b1, b2};
        return valores;
    }

    public void Empalme() {
        int largo1 = 0, largo2 = 0, empalme = 0;
        largo1 = this.bin1.length();
        largo2 = this.bin2.length();
        //***********************************
        // Aqui tenemos que cuadrar el tamaño de los binarios

        if (largo1 > largo2) {

            //calculo la diferenci entre los dos espacions que hay
            empalme = largo1 - largo2;

            for (; empalme > 0; empalme--) {
                this.bin2 = "0" + this.bin2;
            }

            //Con esto se logra agragar los ceros a la izquierda/
            //La cantidad necesaria
        } else if (largo1 < largo2) {
            empalme = largo2 - largo1;
            for (; empalme > 0; empalme--) {
                this.bin1 = "0" + this.bin1;
            }

        }
        //************************************
    }

    public void setBin1(String bin1) {
        this.bin1 = bin1;
    }

    public void setBin2(String bin2) {
        this.bin2 = bin2;
    }

    public String Sumar(String b1, String b2) throws Exception {
        String buffer = "";
        int lleva = 0;
        //La logica inciada
        //para igualar los tamaños
        String[] binarios = Empalme(b1, b2);
        b1 = binarios[0];
        b2 = binarios[1];
        char[] binar1 = b1.toCharArray();
        char[] binar2 = b2.toCharArray();

        //realizo una comprobacion por segruidad de su longitud
        if (binar1.length != binar2.length) {
            throw new Exception("Error: Longitudes Diferentes");
        }
        //se toma el valor del final para inciar de derecha a izquierda como se debe
        int end = binar1.length - 1;
        for (; end >= 0; end--) {
            if ((binar1[end] == '1') && (binar2[end] == '1')) {

                if (lleva == 1) {
                    buffer = "1" + buffer;
                    lleva = 1;

                } else {
                    buffer = "0" + buffer;
                    lleva = 1;
                }

            } else if ((binar1[end] == '0') && (binar2[end] == '0')) {

                if (lleva == 1) {
                    buffer = "1" + buffer;
                    lleva = 0;
                } else {
                    buffer = "0" + buffer;
                }

            } else {
                if (lleva == 1) {
                    buffer = "0" + buffer;
                    lleva = 1;
                } else {
                    buffer = "1" + buffer;
                }

            }

        }

        //para cuando el valor final sobrepasa la cantidad de datos (longitud)
        if (lleva == 1) {
            buffer = "1" + buffer;
            lleva = 0;
        }

        return buffer;

    }

    public String Sumar() throws Exception {
        String buffer = "";
        int lleva = 0;
        //La logica inciada
        //para igualar los tamaños
        Empalme();
        char[] binar1 = this.bin1.toCharArray();
        char[] binar2 = this.bin2.toCharArray();

        //realizo una comprobacion por segruidad de su longitud
        if (binar1.length != binar2.length) {
            throw new Exception("Error: Longitudes Diferentes");
        }
        //se toma el valor del final para inciar de derecha a izquierda como se debe
        int end = binar1.length - 1;
        for (; end >= 0; end--) {
            if ((binar1[end] == '1') && (binar2[end] == '1')) {

                if (lleva == 1) {
                    buffer = "1" + buffer;
                    lleva = 1;

                } else {
                    buffer = "0" + buffer;
                    lleva = 1;
                }

            } else if ((binar1[end] == '0') && (binar2[end] == '0')) {

                if (lleva == 1) {
                    buffer = "1" + buffer;
                    lleva = 0;
                } else {
                    buffer = "0" + buffer;
                }

            } else {
                if (lleva == 1) {
                    buffer = "0" + buffer;
                    lleva = 1;
                } else {
                    buffer = "1" + buffer;
                }

            }

        }

        //para cuando el valor final sobrepasa la cantidad de datos (longitud)
        if (lleva == 1) {
            buffer = "1" + buffer;
            lleva = 0;
        }

        return buffer;

    }

    public String Restar(String bin1, String bin2) throws Exception {
        String salida = "";
        String[] bins = Empalme(bin1, bin2);
        String buffer = "";
        int presta = 0;
        char[] binar1 = bins[0].toCharArray();
        char[] binar2 = bins[1].toCharArray();

        //realizo una comprobacion por segruidad de su longitud
        if (binar1.length != binar2.length) {
            throw new Exception("Error: Longitudes Diferentes");
        }
        //se toma el valor del final para inciar de derecha a izquierda como se debe
        int end = binar1.length - 1;
        for (; end >= 0; end--) {
            if ((binar1[end] == '1') && (binar2[end] == '1')) {

                if (presta == 1) {
                    //Lista
                    buffer = "1" + buffer;
                    presta = 1;

                } else {
                    //Lista
                    buffer = "0" + buffer;

                }

            } else if ((binar1[end] == '1') && (binar2[end] == '0')) {

                if (presta == 1) {
                    buffer = "0" + buffer;
                    presta = 0;
                } else {
                    buffer = "1" + buffer;
                }

            } else if ((binar1[end] == '0') && (binar2[end] == '1')) {
                if (presta == 1) {
                    buffer = "0" + buffer;
                    presta = 1;
                } else {
                    buffer = "1" + buffer;
                    presta = 1;
                }

            } else {
                if (presta == 1) {
                    buffer = "1" + buffer;
                    presta = 1;
                } else {
                    buffer = "0" + buffer;

                }
            }

        }

        //para cuando el valor final sobrepasa la cantidad de datos (longitud)
        if (presta == 1) {
            buffer = "0" + buffer;
            presta = 0;
        }
        return buffer;

    }

    public String Restar() throws Exception {
        String salida = "Do not implement yet";
        Empalme();
        String buffer = "";
        int presta = 0;
        char[] binar1 = this.bin1.toCharArray();
        char[] binar2 = this.bin2.toCharArray();

        //realizo una comprobacion por segruidad de su longitud
        if (binar1.length != binar2.length) {
            throw new Exception("Error: Longitudes Diferentes");
        }
        //se toma el valor del final para inciar de derecha a izquierda como se debe
        int end = binar1.length - 1;
        for (; end >= 0; end--) {
            if ((binar1[end] == '1') && (binar2[end] == '1')) {

                if (presta == 1) {
                    //Lista
                    buffer = "1" + buffer;
                    presta = 1;

                } else {
                    //Lista
                    buffer = "0" + buffer;

                }

            } else if ((binar1[end] == '1') && (binar2[end] == '0')) {

                if (presta == 1) {
                    buffer = "0" + buffer;
                    presta = 0;
                } else {
                    buffer = "1" + buffer;
                }

            } else if ((binar1[end] == '0') && (binar2[end] == '1')) {
                if (presta == 1) {
                    buffer = "0" + buffer;
                    presta = 1;
                } else {
                    buffer = "1" + buffer;
                    presta = 1;
                }

            } else {
                if (presta == 1) {
                    buffer = "1" + buffer;
                    presta = 1;
                } else {
                    buffer = "0" + buffer;

                }
            }

        }

        //para cuando el valor final sobrepasa la cantidad de datos (longitud)
        if (presta == 1) {
            buffer = "0" + buffer;
            presta = 0;
        }
        return buffer;

    }

    public String Multiplicar() throws Exception {

        String salida = "";
        int indicePunto = 0, decimales = 0;
        String buffer = "";
        String b1 = "", b2 = "";
        if (this.bin1.contains(".")) {
            indicePunto = this.bin1.indexOf(".");
            this.bin1 = this.bin1.replace(".", "");
            decimales += this.bin1.length() - indicePunto;

        }
        if (this.bin2.contains(".")) {
            indicePunto = this.bin2.indexOf(".");
            this.bin2 = this.bin2.replace(".", "");
            decimales += this.bin2.length() - indicePunto;
        }

        if (this.bin1.length() > this.bin2.length()) {
            b1 = this.bin1;
            b2 = this.bin2;

        } else if (this.bin1.length() < this.bin2.length()) {
            b1 = this.bin2;
            b2 = this.bin1;
        }

        char[] binar1 = b1.toCharArray();
        char[] binar2 = b2.toCharArray();

        //realizo una comprobacion por segruidad de su longitud
        //se toma el valor del final para inciar de derecha a izquierda como se debe
        int contador = 0, x = 0;
        int end1 = binar1.length - 1;
        int end2 = binar2.length - 1;

        for (int k = end1; k >= 0; k--) {

            for (int j = end2; j >= 0; j--) {

                if ((binar1[k] == '1') && (binar2[j] == '1')) {
                    buffer = "1" + buffer;

                } else {
                    buffer = "0" + buffer;
                }

            }
            while (x < contador) {
                buffer += "0";
                x++;
            }
            x = 0; // reinicio de la variable

            salida += buffer + "-";
            buffer = "";
            contador++;

        }
        String[] sumas = salida.split("-");

        if (sumas.length > 1) {
            //Implementacion de sumas en ciclos
            String acumulado = sumas[0];
            for (int y = 1; y < sumas.length; y++) {
                acumulado = Sumar(acumulado, sumas[y]);
            }
            buffer = acumulado;
        } else {
            buffer = sumas[0];
        }

        if (decimales > 0) {
            int indicePfinal = buffer.length() - decimales;
            buffer = buffer.substring(0, indicePfinal) + "." + buffer.substring(indicePfinal);
        }

        return buffer;
    }

    /**
     *
     * @param b1 Evaluea si este es el Mayor
     * @param b2
     * @return
     */
    public boolean mayorBin(String b1, String b2) {
        boolean res = true;
        int x1 = 0, y2 = 0;

        char[] binC1 = b1.toCharArray();
        char[] binC2 = b2.toCharArray();
        int size1 = binC1.length, size2 = binC2.length;

        for (int x = 0; x < binC1.length; x++) {

            if (binC1[x] == '1') {
                x1 += (size1);
            }
            size1--;
        }

        for (int x = 0; x < binC2.length; x++) {

            if (binC2[x] == '1') {
                y2 += (size2);
            }
            size2--;
        }

        if (x1 < y2) {
            res = false;
        }

        return res;
    }

    public String Dividir() throws Exception {
        String salida = "Do not implement yet";
        //para esto se toma el valor del divisor y se averigua si tiene decimales
        //para luego limpiar de decimales 

        // #otro punto a evaluar es que no se permite la division por 0
        if (Integer.parseInt(this.bin2) == 0) {
            throw new Exception("No se permite la division por cero 0");
        } else if ((!numberValid(this.bin1)) || (!numberValid(this.bin2))) {
            throw new Exception("como sera posbile que hayas digitado mal");
        }

        if (this.bin2.contains(".") && (!this.bin1.contains("."))) {
            int indicePunto = this.bin2.indexOf("."), decimales = 0;
            this.bin2 = this.bin2.replace(".", "");
            decimales = this.bin2.length() - indicePunto;
            for (int x = 0; x < decimales; x++) {
                this.bin1 += "0";

            }

        }
        //Pendiente la division con el divisor con decimales #########
        String cociente = "", resto = "", buffer = "";
        //Ahora se toma la cantidad de caracteres que tiene el dividendo

        int size = this.bin2.length();
        int next = 0;

        if (size > this.bin1.length()) {

            salida = "No Implement YET";

        } else {

            //Primero se cogen cantidades iguales para hacer la resta
            buffer = this.bin1.substring(0, size);
            next = size;

            while (next <= this.bin1.length()) {

                //Ahora se compara si cabe o no osea si el dividendo es mayor
                //Aqui sucede que el divisor es mayor entonces se toma un valor mas
                if (mayorBin(buffer, bin2)) {
                    cociente += "1";
                    resto = Restar(buffer, this.bin2);
                    //Ahora si sera mayor el dividendo
                } else {
                    cociente += "0";
                }

                //Aqui se realiza la resta para obtener el resto
                //Luego se evalua para bajar el siguiente dato
                if (!(next == this.bin1.length())) {
                    resto += this.bin1.charAt(next) + "";

                } else if (Integer.parseInt(resto) > 0) {
                    //Aqui la funcion que hace la divison con cierta cantidad
                    //de decimales para evitar ciclos infinitos
                    //Dos formas de hacerlo
                    //1. Ciclo While interno dentro de esta condicion
                    //2. Funcion externa que calcula y devuelve varios valores -- Dificultad para mostrar el proceso paso a paso a partir de este punto

                    //Decimales por Default 2
                    int decimales = 3;
                    //Opcion 1
                    //Aqui se hace una sola vez lo del punto
                    cociente += ".";
                    while (decimales > 0) {
                        //se añade el 0 necesario y al cociente el punto
                        resto += "0";
                        if (mayorBin(resto, bin2)) {
                            cociente += "1";
                            resto = Restar(resto, this.bin2);
                            //Ahora si sera mayor el dividendo
                        } else {
                            cociente += "0";
                        }
                        decimales--;
                    }

                }

                //si ya se llego al limite se deja con ese valor
                //ahora para el ciclo se le da el valor a buffer de resto 
                buffer = resto;
            //se evalia si el buffer es mayor que el divisor sino entonces 
                //al cociente va un 0 y se le agrega un 0 al buffer

                //Ahora se incrementa la variable next
                next++;

            }

            salida = cociente;
        }

        return salida;
    }

}
