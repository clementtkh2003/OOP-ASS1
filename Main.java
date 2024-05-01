public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static class Lecturer{
        private String name;
        private String room_Num;
        private String staff_Iden;

        public Lecturer(){
            this.name = "";
            this.room_Num = "";
            this.staff_Iden = "";
        }
        public Lecturer(String name, String room_Num, String staff_Iden) {
            this.name = name;
            this.room_Num = room_Num;
            this.staff_Iden = staff_Iden;
        }
        public void setName(String name){
            this.name = name;
        }
        public void setRoom_Num(String num){
            this.room_Num = num;
        }
        public void setIden(String iden){
            this.staff_Iden = iden;
        }
        public String getName(){
            return name;
        }
        public String getRoom_Num(){
            return room_Num;
        }
        public String getIden(){
            return staff_Iden;
        }
        public String toString(){
            String str = "The name of the lecturer is " + name + "Room Number" + room_Num + "identity" + staff_Iden;
            return str;
        }
    }
}