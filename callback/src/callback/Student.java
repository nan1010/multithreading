package callback;

public class Student  implements Dohomework{

    @Override
    public void doHomework(String question, String answer) {
        System.out.println("作业本");
        if(answer != null){
            System.out.println("作业" + question + "答案" + answer);
        }else{
            System.out.println("作业" + question + "答案" + "(空白)");
        }
    }

    public void ask(final String homework, final RoomMate roomMate){
        new Thread(() -> roomMate.getAnswer(homework, Student.this)).start();
        goHome();
    }

    public void goHome(){
        System.out.println("好兄弟，作业交给你了，我先回家了……");
    }

    public static void main(String[] args) {
        Student student = new Student();
        String homework = "当x趋向于0，sin(x)/x =?";
        student.ask(homework, new RoomMate());
    }
}



