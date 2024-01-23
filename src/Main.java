public class Main {
    public static void main(String[] args) {

        var box = 5;
        System.out.println(box);
        box = box + 2;
        System.out.println(box);
        box = box - 3;
        System.out.println(box);
        box = box * 3;
        System.out.println(box);
        box = box / 4;
        System.out.println(box);

        var a = 3;
        var b = 5;

        var result1 = a + b;
        System.out.println("a + b = " + result1 );

        var result2 = a * b;
        System.out.println("a * b = " + result2 );

        var result3 = a / b;
        System.out.println("a / b = " + result3 );

        var result = (a / 2 ) * b;
        System.out.println("(a / 2) * b = " + result );

        var liftingCapacity = 50;
        var stuffWeight = 20;
        var capacityLeft = liftingCapacity - stuffWeight;
        System.out.println("Еще можно положитить " + capacityLeft + "кг вещей");

        var applesWeight = 2;
        var orangesWeight = 3;
        var fruitsWeight = applesWeight + orangesWeight;
        System.out.println("Общий вес фруктов " +  fruitsWeight + "кг!");

        var meatWeight = 4;
        var waterWeight = 5;
        var tomatoesWeight = 2;
        var cucumbersWeight = 2;
        var peppersWeight = 2;
        var zucchiniWeight = 2;
        var vegetablesWeight = tomatoesWeight + peppersWeight + cucumbersWeight + zucchiniWeight;
        var productsWeight = fruitsWeight + vegetablesWeight + meatWeight + waterWeight;
        System.out.println("Общий вес продуктов " + productsWeight + "кг!");

        var leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("Места осталось " + leftWeight + "кг!");

        productsWeight = productsWeight * 2;
        System.out.println("Теперь вес продуктов " +  productsWeight + "кг!");

        leftWeight = liftingCapacity - stuffWeight - productsWeight;
        System.out.println("Теперь места осталось " + leftWeight + "кг!");

        var overload = (stuffWeight + productsWeight) % liftingCapacity;
        System.out.println("Перегруз на " + overload + "кг!");

        var productInOneCar  = productsWeight / 2;
        System.out.println("Продуктов в одной машине теперь " + productInOneCar + "кг!");





        var dog = 8.0;

        System.out.println(dog);

        dog = dog + 4;

        System.out.println(dog);

        dog = dog - 3.5;

        System.out.println(dog);



        var cat = 3.6;

        System.out.println(cat);

        cat = cat + 4;

        System.out.println(cat);

        cat = cat - 1.6;

        System.out.println(cat);




        var paper = 763789;

        System.out.println(paper);

        paper = paper + 4;

        System.out.println(paper);

        paper = paper - 7639;

        System.out.println(paper);




        var friend = 19;

        System.out.println(friend);

        friend = friend + 2;

        System.out.println(friend);

        friend = friend / 7;

        System.out.println(friend);



        var frog = 3.5;
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var totalWeight = (weightBoxer1 + weightBoxer2);
        System.out.println("Общая масса двух боксеров - " + totalWeight + " кг");

        var weightDifference = weightBoxer1 - weightBoxer2;
        System.out.println("Разница между массами боксеров " + weightDifference + " кг");

        var weightDifferenceModulo = weightBoxer2 % weightBoxer1;
        System.out.println("Разница между массами боксеров " + weightDifferenceModulo + " кг");





        var totalHours = 640;
        var hoursPerEmployees = 8;
        var totalEmployees = totalHours / hoursPerEmployees;
        System.out.println("Всего работников в компании - " + totalEmployees + " человек");

        var additionalEmployees = 94;
        var newTotalEmployees = totalEmployees + additionalEmployees;
        var newTotalHours = newTotalEmployees * hoursPerEmployees;
        System.out.println("Если в компании работает " + newTotalEmployees + " человек, то всего " + newTotalHours + " часов может быть поделено между сотрудниками ");




    }
}