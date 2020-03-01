package f;

import java.util.List;
import java.util.stream.Collectors;

public class App 
{
    public static void main( String[] args )
    {
        MyStructure myStructure = new MyStructure("MyStructure");

        Node node1 = new Node("1", "Pracownik 1");
        Node node2 = new Node("2", "Pracownik 2");
        Node node3 = new Node("3", "Pracownik 3");
        Node node4 = new Node("4", "Pracownik 4");

        CompositeNode manager1 = new CompositeNode("5", "Manager 1");
        CompositeNode manager2 = new CompositeNode("6", "Manager 2");

        manager1.add(node1);
        manager1.add(node2);
        manager1.add(manager2);
        //manager1.add(node1);//uncomment for excepiton
        
        myStructure.add(manager1);
        myStructure.add(node3);
        // myStructure.add(node1);//uncomment for excepiton

        System.out.println("\n"+">>>> LUDZIE "+ manager1.getRenderer() +"<<<< \n" + manager1.getNodes()+"\n");
        System.out.println(">>>> LUDZIE "+ manager2.getRenderer() +"<<<< \n" + manager2.getNodes()+"\n");
        System.out.println(">>>> ILOSC WEZLOW W STRUKTURZE: <<<< \n" +myStructure.count()+"\n");
        System.out.println(">>>> LUDZIE W STRUKTURZE <<<< \n" +myStructure.getNodes()+"\n");
        System.out.println(">>>> Wyszukiwarka <<<<");
        System.out.println(">>>> -po kodzie: <<<<");
        System.out.println(myStructure.findByCode("5")+ "\n");
        System.out.println(">>>> -po rendererze: <<<<");
        System.out.println(myStructure.findByRenderer("Pracownik 2")+ "\n");
        
        




        

    }
}
