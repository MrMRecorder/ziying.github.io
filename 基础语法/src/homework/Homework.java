    package homework;

    /**
     * @author 紫英
     * @version 1.0
     * @discription 接口作业
     */
    public class Homework {

        public static void main(String[] args) {
            Person person = new Person("唐僧",new Hourse());
            person.passCommon();
            person.passRiver();
            person.passCommon();
            person.passRiver();
            person.passMontuant();
        }
    }

    interface Vehicles {
        public void work();
    }
    class Planet implements Vehicles{

        @Override
        public void work() {
            System.out.println("飞机呼呼呼。。。");
        }
    }

    class Hourse implements Vehicles {

        @Override
        public void work() {
            System.out.println("骑马哒哒哒...");
        }
    }

    class Boat implements Vehicles {

        @Override
        public void work() {
            System.out.println("划船呼呼呼...");
        }
    }

    class Factory {

        public static Hourse getHouse() {
            Hourse hourse = new Hourse();
            return hourse;
        }

        public static Boat getBoat() {
            Boat boat = new Boat();
            return boat;
        }
        public static Planet getPlanet(){
            Planet planet = new Planet();
            return planet;
        }


    }

    class Person {
        private String name;
        private Vehicles vehicles;

        public Person() {
        }

        public Person(String name, Vehicles vehicles) {
            this.name = name;
            this.vehicles = vehicles;
        }

        public Vehicles getVehicles() {

            return vehicles;
        }

        public void passRiver(){
            if (!(vehicles instanceof Boat)){
                vehicles = Factory.getBoat();
            }
            vehicles.work();
        }
        public void passCommon(){
            if (!(vehicles instanceof Hourse)){
                vehicles = Factory.getHouse();
            }

            vehicles.work();
        }
        public void passMontuant(){
            if (!(vehicles instanceof Planet)){
                vehicles = Factory.getPlanet();
            }

            vehicles.work();
        }
        public void setVehicles(Vehicles vehicles) {
            this.vehicles = vehicles;
        }

        public Person(String name, Vehicles vehicles, String state) {
            this.name = name;
            this.vehicles = vehicles;

        }


    }
