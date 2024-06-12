package com.hus.oop.exercise05;


public class TestMyPoint3D {
    public static void main(String[] args) {
//        MyPoint3D point1 = new MyPoint3D();
//        System.out.println(point1);
//
//        point1.setXYZ(3,4,5);
//        System.out.println(point1.getXYZ()[0]);
//        System.out.println(point1.getXYZ()[1]);
//        System.out.println(point1.getXYZ()[2]);
//
//        Square square = new Square(3);
//        System.out.println(square);
//        System.out.println("area is: " + square.getArea());
//        System.out.println("perimeter is: "+ square.getPerimeter());

//        Time now = new Time(1,6,9);
//        System.out.println("now is: " + now);
//        System.out.println(now.convertToSecond());
//        now.raiseSecond(54);
//        now.raiseMinute(56);
//        now.raiseHour(13);
//        System.out.println(now);
            Date today = new Date(23,4,2024);
            Date tomorrow = new Date(23, 2,2025);

        System.out.println(today.dayBetween(tomorrow));


    }

    public static class Student extends People {

        private final int ID; // student id
        private final String MAJOR; // example: Data Science
        private final int COURSE; // example: 68 = K68
        private double gpa = 0;
        private double studyHour;

        public Student(String name , String id , int age , int ID , String MAJOR , int COURSE) {
            super(name , id , age);
            this.ID = ID;
            this.MAJOR = MAJOR;
            this.COURSE = COURSE;
        }

        public int getID() {
            return ID;
        }

        public String getMAJOR() {
            return MAJOR;
        }

        public int getCOURSE() {
            return COURSE;
        }

        /**
         * This method increases the number of study hours for students.
         *
         * @param hour The time students have spent studying before the exam
         */
        public void study(int hour){
            /*TODO*/
            this.studyHour += hour;
        }

        /**
         * This method check if can student pass all the exam
         *
         * @param hours The minimum study time required for each course a
         *              student has registered for in order to pass.
         *
         * @return true if student can pass all the exam
         */
        public boolean pass(int[] hours){
            /*TODO*/
            for (int hour : hours) {
                if (hour < studyHour) {
                    return false;
                }
            }
            return true;
        }

        /**
         * This method deducts the corresponding study time of the subjects
         * from the minimum study time list. The program stops when the study
         * time is less than or equal to 0.
         * <p>
         * The formula for calculating grades based on a 4-point scale applied
         * here is as follows:
         * Grade = coefficient * minimum study time (with the coefficient being
         * self-determined.)
         * <p>
         * Suppose that each subject carries 3 credit.
         * @param hours the minimum study time required for each course a
         *              student has registered for in order to pass.
         * @param portion The ratio of study time before the exam that
         *                students have allocated to each respective subject.
         */
        public void test(int[] hours, int[] portion){
            /*TODO*/
        }

        /**
         * This method check if student can get scholarship or not
         *
         * @return true if 'GPA' > 3.5 and studyHour left > 1
         */
        public boolean getScholarship(){
            /*TODO*/
            return false;
        }

        @Override
        public String toString() {
            return "Student{" + "ID=" + ID + ", MAJOR='" + MAJOR + '\'' + ", COURSE=" + COURSE + ", gpa=" + gpa + ", studyHour=" + studyHour + '}';
        }
    }
}
