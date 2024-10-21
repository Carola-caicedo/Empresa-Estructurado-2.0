package clasesEmpresa;

import java.util.ArrayList;

public class Empresa {
    ArrayList<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<>();
    }

    //Metodo que agrega empleados a la empresa
    public void contratarEmpleados(Empleado e) {
        empleados.add(e);
    }

    //Metodo que obtiene el total de empleados
    public int getTotalEmpleados() {
        return empleados.size();
    }

    //Metodo que muestra el nombre y salrio de los empleados
    public void nombreSalario(){
        for (Empleado e:empleados) {
            System.out.println("nombre: " + e.getNombre() + "Salario: " + e.getSalario());

        }
    }

    //Metodo que retorna el total de dinero pagado a todos los empleados
    public double getTotalSalarios() {
        double total  = 0;
        for(Empleado e: empleados) {
            total = total + e.getSalario();
        }
        return total;
    }
}
