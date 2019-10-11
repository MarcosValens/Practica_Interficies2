public interface IStudent {
    Student getStudent(String id);
    void removeStudent(String id);
    void addStudent (Student student);
    void contractStudent(String id);
}
