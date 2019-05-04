package com.xxx.springboot.bean;

    public class hobby {


        private String des;
        private int age;

        public String getDes() {
            return des;
        }

        public void setDes(String des) {
            this.des = des;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "hobby{" +
                    "des='" + des + '\'' +
                    ", age=" + age +
                    '}';
        }


    }
