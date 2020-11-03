package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        StringBuilder result = new StringBuilder();
        // create a `counter`
        Integer counter = 0;
        Person currentPerson;
        // while `counter` is less than length of array
        while(counter < personArray.length) {
            // begin loop

            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            currentPerson = personArray[counter];
            currentPerson.toString();
            result.append(currentPerson);

            counter++;

            // end loop
        }
        return String.valueOf(result);
    }



    public String forLoop() {
        StringBuilder result = new StringBuilder();
        Person currentPerson;
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
        for(int i = 0; i < personArray.length; i++) {
            // use `counter` to identify the `current Person` in the array
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            currentPerson = personArray[i];
            currentPerson.toString();
            result.append(currentPerson);
        }
            // end loop

        return String.valueOf(result);
    }



    public String forEachLoop() {
        StringBuilder result = new StringBuilder();
        Person currentPerson;
        Integer counter = 0;
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
        for( Person people : personArray) {
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            currentPerson = personArray[counter];
            currentPerson.toString();
            result.append(currentPerson);
            counter++;
        }
            // end loop

        return String.valueOf(result);
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
