package util;

import entities.Appointment;
import entities.Bill;
import entities.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HibernateService {
    public HibernateService() {

    }


    public static List<Appointment> loadAppointmentData(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        List<Appointment> appointments = new ArrayList<>();
        try {
            Query<Appointment> query = session.createQuery("From Appointment where patientId = :id", Appointment.class);
            query.setParameter("id", id);
            appointments = query.list();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        }
        session.close();
        return appointments;
    }

    public static List<Bill> loadBillData(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        List<entities.Bill> bills = null;
        try {
            Query<entities.Bill> query = session.createQuery("From Bill where patientId = :id", entities.Bill.class);
            query.setParameter("id", id);
            bills = query.list();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        }
        session.close();
        return bills;
    }

    public static Boolean saveBillAndUpdateAppointment(Bill bill, List<Integer> ids) {
        String date = "";
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        date = dateFormat.format(new Date());
        bill.setPaymentDate(date);
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        int updatedRows = 0;
        try {
            session.persist(bill);
            session.flush();
            bill.generateBillCode();
            session.merge(bill);
            String hql = "UPDATE Appointment a SET a.status = true WHERE a.id in :id";
            Query query = session.createQuery(hql);
            query.setParameter("id", ids);
            updatedRows = query.executeUpdate();
            transaction.commit();
        } catch (Exception e) {
            updatedRows = 0;
            transaction.rollback();
            return false;
        }
        session.close();
        return updatedRows > 0;
    }


    public static Boolean saveAppointment(Appointment appointment) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.persist(appointment);
            session.flush();
            appointment.generateAppointmentCode();
            session.merge(appointment);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            return false;
        }
        session.close();
        return true;
    }

    public static List<User> getUserList() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        List<User> userList = new ArrayList<>();
        try {
            Query<User> userQuery = session.createQuery("FROM User", User.class);
            userList = userQuery.getResultList();
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        }
        return userList;
    }

    public static List<Appointment> searchAppointment(String name) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        List<Appointment> appointments = new ArrayList<>();
        try {
            Query<Appointment> query = session.createQuery("FROM Appointment where name like :name ", Appointment.class);
            query.setParameter("name", "%" + name + "%");
            appointments = query.list();
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        }
        return appointments;
    }

    public static Boolean updateBalance(int id, int cost) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        int updatedRows = 0;
        try {
            String hql = "UPDATE User u SET u.balance = :balance WHERE u.id = :id";
            Query query = session.createQuery(hql);
            query.setParameter("balance", cost);
            query.setParameter("id", id);
            updatedRows = query.executeUpdate();
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        }
        session.close();
        return updatedRows > 0;
    }

    public static Boolean updateInformation(int id, String hoTen, String ngaySinh, String maBenhNhan, String sdt, String gioiTinh, String queQuan) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        int updatedRows = 0;
        try {
            String hql = "UPDATE User u SET u.hoten = :name,u.quequan = :quequan,u.gioitinh = :gioitinh, u.mabn = :mabn, u.ngaysinh = :ngaySinh,u.sdt = :sdt WHERE u.id = :id";
            Query query = session.createQuery(hql);
            query.setParameter("name", hoTen);
            query.setParameter("ngaySinh", ngaySinh);
            query.setParameter("mabn", maBenhNhan);
            query.setParameter("sdt", sdt);
            query.setParameter("gioitinh", gioiTinh);
            query.setParameter("quequan", queQuan);
            query.setParameter("id", id);
            updatedRows = query.executeUpdate();
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        }
        session.close();
        return updatedRows > 0;
    }

    public static Boolean updatePinCode(int id, String pinCode) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        int updatedRows = 0;
        try {
            String hql = "UPDATE User u SET u.mapin = :pinCode WHERE u.id = :id";
            Query query = session.createQuery(hql);
            query.setParameter("pinCode", pinCode);
            query.setParameter("id", id);
            updatedRows = query.executeUpdate();
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        }
        session.close();
        return updatedRows > 0;
    }

}
