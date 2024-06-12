package com.hus.oop.exercise02;

public class CustomerAndAccount {
        private int id;
        private String name;
        private char gender;

        public CustomerAndAccount(int id, String name, char gender){
            this.id = id;
            this.name = name;
            this.gender = gender;
        }
        public int getID(){
            return id;
        }
        public String getName(){
            return name;
        }
        public char getGender(){
            return gender;
        }
        public String toString(){
            return name + "(" + id + ")";
        }
    }


