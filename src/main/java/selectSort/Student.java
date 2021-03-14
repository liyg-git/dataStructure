package selectSort;

/**
 * 比较类
 * @author 李永刚
 */
public class Student implements Comparable<Student> {
    private String name;
    private int score;

    public Student(String name,int score){
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object student) {
        if (this == student) {
            return true;
        }
        if (student == null || getClass() != this.getClass()) {
            return false;
        }
        Student another = (Student) student;
        return this.name.equals(another.name);
    }

    public int compareTo(Student another) {
//        if(this.score<another.score){
//            return -1;
//        }else if(this.score==another.score){
//            return 0;
//        }
//        return 1;
        return this.score-another.score;
    }

    @Override
    public String toString() {
        return String.format("Student(name:%s,score:%d)",name,score);
    }
}
