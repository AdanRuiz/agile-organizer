package com.springboot.MyTodoList.model;


import javax.persistence.*;
import java.time.OffsetDateTime;

/*
    representation of the USER table that exists already
    in the autonomous database

    CREATE TABLE TODOUSER.USERS (
        ID NUMBER GENERATED BY DEFAULT ON NULL AS IDENTITY, -- ID autoincremental
        NAME VARCHAR2(50),        -- Campo para nombres, longitud máxima de 50 caracteres
        LASTNAME VARCHAR2(50),    -- Campo para apellidos, longitud máxima de 50 caracteres
        PHONENUMBER NUMBER(10),        -- Campo numérico, con un máximo de 10 dígitos
        USERPASSWORD VARCHAR2(100),    -- Campo para contraseñas, longitud máxima de 100 caracteres
        PRIMARY KEY (ID) -- Define ID como clave primaria
   );
 */
@Entity
@Table(name = "USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int ID;

    @Column(name = "NUMBER")
    String phonenumber;

    @Column(name = "PASSWORD")
    String userpassword;

    public User(){}

    public User(int ID, String number, String password){
        this.ID=ID;
        this.phonenumber = number;
        this.userpassword = password;
    }

    public int getID(){
        return ID;
    }

    public void setID(int ID){
        this.ID=ID;
    }

    public String getPhoneNumber(){
        return phonenumber;
    }

    public void setPhoneNumber(String number){
        this.phonenumber=number;
    }

    
    public String getUserPassword(){
        return userpassword;
    }

    public void setUserPassword(String password){
        this.userpassword=password;
    }

}