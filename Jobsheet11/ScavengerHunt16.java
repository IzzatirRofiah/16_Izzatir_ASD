public class ScavengerHunt16 {
    Pointer16 head;
    public ScavengerHunt16() {
        this.head = null;
    }
    public void addPoint(String question, String answer) {
        Pointer16 newPoint = new Pointer16(question, answer);
        if (head == null) {
            head = newPoint;
        } else {
            Pointer16 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newPoint;
        }
    }
    public void displayPoints() {
        Pointer16 current = head;
        int index = 1;
        while (current != null) {
            System.out.println("Point " + index + ": " + current.pertanyaan);
            current = current.next;
            index++;
        }
    }
    public boolean checkAnswer(String userAnswer) {
        if (head != null) {
            if (head.jawaban.equals(userAnswer)) {
                head = head.next;
                return true;
            }
        } else {
            return false;
        }
        return false;
    }
}
