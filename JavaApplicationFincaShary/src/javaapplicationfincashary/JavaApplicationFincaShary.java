/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplicationfincashary;


public class JavaApplicationFincaShary {
    
        private String str_codigo;
        private String str_nombre;
        private String str_ubicacion;
        private String str_prop;
        private String str_correo;
        
        public JavaApplicationFincaShary(String codigo, String nombre, String ubicacion, String propietario, String correo) {
           
            this.str_codigo = codigo;
            this.str_nombre = nombre;
            this.str_ubicacion = ubicacion;
            this.str_prop = propietario;
            this.str_correo = correo;

        }

    public String getStr_codigo() {
        return str_codigo;
    }

    public String getStr_nombre() {
        return str_nombre;
    }

    public String getStr_ubicacion() {
        return str_ubicacion;
    }

    public String getStr_prop() {
        return str_prop;
    }

    public String getStr_correo() {
        return str_correo;
    }

        //setters

    public void setStr_codigo(String str_codigo) {
        this.str_codigo = str_codigo;
    }

    public void setStr_nombre(String str_nombre) {
        this.str_nombre = str_nombre;
    }

    public void setStr_ubicacion(String str_ubicacion) {
        this.str_ubicacion = str_ubicacion;
    }

    public void setStr_prop(String str_prop) {
        this.str_prop = str_prop;
    }

    public void setStr_correo(String str_correo) {
        this.str_correo = str_correo;
    }
    
}

       

