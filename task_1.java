public class task_1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("select * from students where ");
        System.out.println(sb.toString());
        sb.append( "name: Ivanov, country: Russia, city: Moscow, age:18");
        System.out.println(sb.toString());
    
    }
}
