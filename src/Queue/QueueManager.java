package Queue;

import models.Appointment;
import java.util.LinkedList;
import java.util.Queue;

public class QueueManager {
    private Queue<Appointment> appointmentQueue;

    public QueueManager() {
        appointmentQueue = new LinkedList<>();
    }

    public void addToQueue(Appointment appointment) {
        appointmentQueue.add(appointment);
    }

    public Appointment callNext() {
        return appointmentQueue.poll();
    }

    public void markStatus(String appointmentId, String newStatus) {
        for (Appointment appointment : appointmentQueue) {
            if (appointment.getAppointmentId().equals(appointmentId)) {
                appointment.updateStatus(newStatus);
                break;
            }
        }
    }

    public int getQueueSize() {
        return appointmentQueue.size();
    }
}
