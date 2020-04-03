package study.qi.pojo;

public class Student {
    private int id;
    private String name;
    private int tid;

    // 学生关联一个老师
    private Teacher teacher;

    public Student() {
    }

    public Student(int id, String name, int tid, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.tid = tid;
        this.teacher = teacher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tid=" + tid +
                ", teacher=" + teacher +
                '}';
    }
}
