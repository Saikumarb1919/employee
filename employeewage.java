public class employeewage {
        //constant
        public static final int IS_FULL_TIME = 1;
        public static final int IS_PART_TIME = 2;
        public static final int EMP_RATE_PER_HOUR = 100;
        public static final int MAX_WORKING_HOUR = 20;

        public static void main(String args[]) {
                //variable
                int total_wage = 0;
                int emp_hours = 0;
                int emp_wage = 0;

                for(int i = 0; i < MAX_WORKING_HOUR; i++) {
                        int empCheck = (int) (Math.floor(Math.random()*10)%3);

                        switch(empCheck) {
                                case IS_PART_TIME:
                                        emp_hours=4;
                                        break;
                                case IS_FULL_TIME:
                                        emp_hours=8;
                                        break;
                                default:
                                        emp_hours=0;
                                        break;
                        }

                        emp_wage = emp_hours * EMP_RATE_PER_HOUR;
                        total_wage = emp_wage;
                        System.out.println("Employee wage for"+ i +"day : " +emp_wage);
                }

                System.out.println("Total wage of employee : "+total_wage);
        }
}
