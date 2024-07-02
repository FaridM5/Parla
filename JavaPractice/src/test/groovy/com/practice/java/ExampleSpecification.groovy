import com.practice.java.randomly.RandomEntity
import spock.lang.Specification

class ExampleSpecification extends Specification{
//    def "Should be a simple assertion"() {
//        expect:
//        1==1
//    }

//    def "Should be a simple assertion"() {
//        expect:
//        1==3
//    }

    def "demonstration of given when and then"(){
        given:
        def randomEntity = RandomEntity.builder()
                .randomName("Farid")
                .randomSurname("Mammadli")
                .age(5)
                .anyNumber(55939)
                .build()

        when:
        def nameOfEntity = randomEntity.getRandomName()

        then:
        assert nameOfEntity == "Farid"
    }

}
