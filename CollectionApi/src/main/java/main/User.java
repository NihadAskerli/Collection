package main;

public class User implements Comparable<User>{
    public int age;
    public User(int age){
        this.age=age;
    }
//    sanki bir linked listin prinsipidir
    private User user;

    public void setUser(User user) {

        this.user = user;
    }

    public User getUser() {

        return user;
    }

    @Override
    public int compareTo(User o) {
      int result=0;
      if(o.age==this.age){
          return 0;
      }else if(this.age<o.age){
          return -1;
      }else if(this.age>o.age){
          return 1;
      }
      return result;
    }
}
