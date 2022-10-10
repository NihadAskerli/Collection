package main;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        ArrayList<String>l=new ArrayList<>();
//        l.add("Nihad");
//        l.add("Niko");
//        l.add("Salam");
//        l.add("Askerli");
//        System.out.println("size ="+l.size());
////        for(int i=0;i<l.size();i++){
////            System.out.println(l.get(i));
////        }array listi idi yuxari kod
//        LinkedList<String>l=new LinkedList<>();
//        l.add("niko");
//        User user1=new User();
//        User user2=new User();
//        User user3=new User();
//        user1.setUser(user2);
//        user2.setUser(user3);
//        user1.getUser().getUser().getUser(); linked list islemesi sanki
//        Vector<String> l=new Vector<>();
//        l.add("Nihad"); vectorda bele
// Collection<String>coll=Collections.synchronizedList(new ArrayList<String>()); sinkorinize
//        ArrayList<String> list= new ArrayList<>();
//        list.add("salam");
//        list.add("Necesen");
//        list.add("qaqon teze orgendi bunu");
//        MyArray = new MyArrayList();
//        for (String s:list) {
////            for each
//            System.out.println(s);
//
//        }
//        Iterator<String>iter= list.iterator();
//
//        while(iter.hasNext()){
//            String s=iter.next();
//            System.out.println(s);
////            yazdigimiz while dongusu for eachin ekvivalentidir
//        }
// User u= new User();
// u.age=2;
// User u2=new User();
// u2.age=1;
//        System.out.println(u.compareTo(u2)); comperable muqayisesi
//        burada icinde olan obyektle gonderilen obyekti muqayise edir
        Comparator<User> compar = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int result = 0;
                User u1 = (User) o1;
                User u2 = (User) o2;
                if (u1.age == u2.age) {
                    return 0;
                } else if (u1.age < u2.age) {
                    return -1;
                } else if (u1.age > u2.age) {
                    return 1;
                }
                return result;
            }
        };
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                int result=0;
//                int i1=(int)o1;
//                int i2=(int)o2;
//                if(i1==i2){
//                    return 0;
//                }else if(i1<i2){
//                    return -1;
//                }else if(i1>i2){
//                    return 1;
//                }
//                return result;
//            }


    ;
    //        System.out.println(compar.compare(5,4));
    List<User> list = Arrays.asList(new User(4), new User(5), new User(3), new User(7));
//        for (User u:list
//             ) {
//            System.out.println(u.age);
//        }
//        System.out.println("--------");
        Collections.sort(list);
        for (User u:list
             ) {
            System.out.println(u.age);
        }


}
    }

