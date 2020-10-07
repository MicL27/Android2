package com.curso.android2;

import java.util.Date;

public class Info {
    private String nombre;
    private Date fechaNacimiento;
    private Integer tel;
    private String mail;
    private String desc;

    public Info(String nombre, Date fechaNacimiento, Integer tel, String mail, String desc) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.tel = tel;
        this.mail = mail;
        this.desc = desc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getTel() {
        return tel;
    }

    public void setTel(Integer tel) {
        this.tel = tel;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
