/** Observer (Part 5): ส่งอีเมลยืนยันเมื่อมีคำสั่งซื้อใหม่ */
public class EmailService implements OrderObserver {
    @Override public void update(Order order) {
        System.out.println("Confirmation email sent to " + order.customerEmail());
        // TODO (5b): พิมพ์ "Confirmation email sent to <customerEmail>"
        //   hint: System.out.println("Confirmation email sent to " + order.customerEmail());
        /* ====== fill in 1 line here ====== */
    }
}
