
package com.prueba.dai.Dto;

import javax.validation.constraints.NotBlank;


public class dtoEducacion {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    private String fechaFinalizacion;

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreE, String descripcionE, String fechaFinalizacion) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(String fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }


    
}
