import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Data data1 = new Data(1,"Joe",70000,"3");
        Data data2 = new Data(2,"Henry",80000,"4");
        Data data3 = new Data(3,"Sam",60000,"");
        Data data4 = new Data(4,"Max",90000,"");

        HashMap<Integer,Data> dataHashMap = new HashMap<>();

        dataHashMap.put(data1.getId(), data1);
        dataHashMap.put(data2.getId(), data2);
        dataHashMap.put(data3.getId(), data3);
        dataHashMap.put(data4.getId(), data4);

        List<HashMap<Integer,Data>> datalist = new ArrayList<>();
        datalist.add(dataHashMap);
        System.out.println("+----+-------+--------+-----------+");
        System.out.println("| Id | Name  | Salary | ManagerId |");
        System.out.println("+----+-------+--------+-----------+");
        for (HashMap<Integer,Data> h : datalist)
        {
            Set<Integer> key = h.keySet();
            for(Integer i : key)
            {
                System.out.println("| "+ h.get(i).getId() +"  |"+h.get(i).getName()+"| "+"\t"+h.get(i).getSalary()+"| "+"\t"+h.get(i).getManagerId()+"\t"+"|");
            }
        }
        System.out.println("+----+-------+--------+-----------+");
    }
}




class Data {
    private int Id;
    private String Name;
    private int Salary;
    private String ManagerId;
    Data(int Id, String Name, int Salary, String ManagerId){
        this.Id = Id;
        this.Name = Name;
        this.Salary = Salary;
        this.ManagerId = ManagerId;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public int getSalary() {
        return Salary;
    }

    public String getManagerId() {
        return ManagerId;
    }
}