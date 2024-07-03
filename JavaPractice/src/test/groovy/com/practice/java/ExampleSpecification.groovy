import com.practice.java.randomly.*
import spock.lang.Specification
import spock.lang.Subject

class ExampleSpecification extends Specification{

    RandomEntity randomEntity
    Function myFunction

    def setup(){
        myFunction = Mock()
        randomEntity = new RandomEntity()
        randomEntity.setFunction(myFunction)
    }

    def "Should be a simple assertion"() {
        expect:
        1==1
    }

    def "demonstration of given when and then"(){
        given:
//        def randomEntity = new RandomEntity()
        randomEntity.setRandomName("Farid")

        when:
        def nameOfEntity = randomEntity.getRandomName()

        then:
        assert nameOfEntity == "Farid"
    }

    def "illegal argument"(){
//        given:
//        def randomEntity = new RandomEntity()

        when:
        randomEntity.setAge(-5)

        then:
        thrown(IllegalArgumentException.class)
    }

    def "if correctly prints"(){
//        given:
//        RandomEntity randomEntity = new RandomEntity()

        when:
            randomEntity.setRandomName("Farid")
            randomEntity.setRandomSurname("Mammadli")
            def result = randomEntity.getInitials(randomEntity.getRandomName(),randomEntity.getRandomSurname())


        then:
        result == "FM"
    }

        def "several values for testing. Usage of Where"(){
//            given:
//            RandomEntity randomEntity = new RandomEntity()

            when:
            def age = -5
            randomEntity.setAge(age)

            then:
            def exception = thrown(IllegalArgumentException)

            where:
            ages << [-4, -3, -2, -1]
        }

        def "Data Driven test with where"(){
            given:
            randomEntity.setAge(5)
            randomEntity.setAnyNumber(100)

            when:
            def result = randomEntity.addition(randomEntity.getAge(), randomEntity.getAnyNumber())

            then:
            result == 105

//            where:
//            age | number | results
//            10  | 20     | 30
//            20  | 20     | 40
//            200 | 50     | 250
//            15  | 5      | 20

            where:
            age | number || results
            10  | 20     || 30
            20  | 20     || 40
            200 | 50     || 250
            15  | 5      || 20

        }

        def "Usage of expect only"(){
            given:
            randomEntity.setAge(5)
            randomEntity.setAnyNumber(10)

            expect:
            randomEntity.addition(randomEntity.getAge(),randomEntity.getAnyNumber()) == 15
        }

        def "Calling using mock"(){
            when:
            @Subject
            def myVal = randomEntity.recursion(0)

            then:
            _ * myFunction.myFunction(0) >> 1L
            myVal == 1L
        }

        def "using with(){} for testing"(){
            when:
            randomEntity.setRandomName("Farid")
            randomEntity.setRandomSurname("Mammadli")

            then: "verifyAll can also be used for that purpose. We can see which one passes and which one not"
//            with(randomEntity){
//                getRandomName() == "Farid"
//                getRandomSurname() == "Mammadlii"
//            }

            verifyAll (randomEntity){
                getRandomName() == "Farid"
                getRandomSurname() == "Mammadlii"
            }
        }

}
