public class Alcancia {

    private int M_50;
    private int M_100;
    private int M_200;
    private int M_500;
    private int M_1000;
 
    // CONSTRUCTOR QUE INICIALIZA LAS VARIABLES DE CLASE
    public Alcancia(int M_50, int M_100, int M_200, int M_500, int M_1000) {
       this.M_50 = M_50;
       this.M_100 = M_100;
       this.M_200 = M_200;
       this.M_500 = M_500;
       this.M_1000 = M_1000;
    }
 
    // METODOS GET Y SET PARA PODER RECUPERAR O CAMBIAR
    // LOS DATOS DE LAS VARIABLES DE CLASE
 
    public Alcancia() {
        
    }

    public int getM_50() {
       return M_50;
    }
 
    public void setM_50(int Moneda) {
       this.M_50 = Moneda;
    }
 
    public int getM_100() {
       return M_100;
    }
 
    public void setM_100(int Moneda) {
       this.M_100 = Moneda;
    }
 
    public int getM_200() {
       return M_200;
    }
 
    public void setM_200(int Moneda) {
       this.M_200 = Moneda;
    }
 
    public int getM_500() {
       return M_500;
    }
 
    public void setM_500(int Moneda) {
       this.M_500 = Moneda;
    }

    public int getM_1000() {
        return M_1000;
    }
  
    public void setM_1000(int Moneda) {
        this.M_1000 = Moneda;
    }

    public int Tot_Monedas() {
        return  M_50 + M_100 + M_200 + M_500 + M_1000;
    }

    public int Tot_dinero() {
        return (M_50 * 50) + (M_100 * 100) + (M_200 * 200) + (M_500 * 500) + (M_1000 * 1000);
    }

    public int Tot_Monedas_Denominacion(int opcion) {
        switch (opcion) {
            case 1:
            return  M_50;
            case 2:
            return  M_100;
            case 3:
            return  M_200;
            case 4:
            return  M_500;
            case 5:
            return  M_1000;
            default:
            return 0;
        }
    }

    public int Tot_Dinero_Denominacion(int opcion) {
        switch (opcion) {
            case 1:
            return  M_50 * 50;
            case 2:
            return  M_100 * 100;
            case 3:
            return  M_200 * 200;
            case 4:
            return  M_500 * 500;
            case 5:
            return  M_1000 * 1000;
            default:
            return 0;
        }
    }

}
