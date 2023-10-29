package seminar5Test4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminar5Task4.Person;
import seminar5Task4.School;

import static org.junit.jupiter.api.Assertions.*;

public class SchoolIntegrationTest {

    private School peopleLisl;
    @BeforeEach
    public void setUp(){
        peopleLisl = new School();

    }

    @Test
    public void testSchoolIntegration() {
// Задание:
// 1. Создайте учебное заведение (School).
        School school = new School();
// 2. Добавьте преподавателя (Леонид) и студентов (Роман, Сергей, Алина, Максим, Александр, Олег, Инна) в учебное заведение.
        Person person1 = new Person("Leonid", true);
        Person person2 = new Person("Roman", false);
        Person person3 = new Person("Sergey", false);
        Person person4 = new Person("Alina", false);
        Person person5 = new Person("Maxim", false);
        Person person6 = new Person("Alex", false);
        Person person7 = new Person("Oleg", false);
        Person person8 = new Person("Inna", false);

        peopleLisl.addPerson(person1);
        peopleLisl.addPerson(person2);
        peopleLisl.addPerson(person3);
        peopleLisl.addPerson(person4);
        peopleLisl.addPerson(person5);
        peopleLisl.addPerson(person6);
        peopleLisl.addPerson(person7);
        peopleLisl.addPerson(person8);

// 3. Проверьте, что Леонид является преподавателем в учебном заведении.
        assertTrue(peopleLisl.isTeacherInSchool("Leonid"));
// 4. Проверьте, что Роман является студентом в учебном заведении.
        assertTrue(peopleLisl.isStudentInSchool("Roman"));
// 5. Попробуйте добавить ещё одного студента и убедитесь, что он также является студентом в учебном заведении.
    Person person9 = new Person("Erika", false);
    peopleLisl.addPerson(person9);
    assertTrue(peopleLisl.isStudentInSchool("Erika"));
// Подсказка: Используйте методы addPerson, isTeacherInSchool и isStudentInSchool из класса School.
// Проверьте, что результаты соответствуют ожиданиям.

// Ваш код здесь
    }
}