import com.practice.java.randomly.RandomEntity
import spock.lang.Specification

class ExampleSpecification extends Specification{
    def "Should be a simple assertion"() {
        expect:
        1==1
    }

    def "demonstration of given when and then"(){
        given:
        def randomEntity = new RandomEntity()
        randomEntity.setRandomName("Farid")

        when:
        def nameOfEntity = randomEntity.getRandomName()

        then:
        assert nameOfEntity == "Farid"
    }

    def "illegal argument"(){
        given:
        def randomEntity = new RandomEntity()

        when:
        randomEntity.setAge(-5)

        then:
        thrown(IllegalArgumentException.class)
    }

    def "if correctly prints"(){
        given:
        RandomEntity randomEntity = new RandomEntity()

        when:
            randomEntity.setRandomName("Farid")
            randomEntity.setRandomSurname("Mammadli")
            def result = randomEntity.getInitials(randomEntity.getRandomName(),randomEntity.getRandomSurname())


        then:
        result == "FM"
    }

        def "several values for where"(){
            given:
            RandomEntity randomEntity = new RandomEntity()

            when:
            def age = -5
            randomEntity.setAge(age)

            then:
            def exception = thrown(IllegalArgumentException)

            where:
            ages << [-4, -3, -2, -1]


        }

}
