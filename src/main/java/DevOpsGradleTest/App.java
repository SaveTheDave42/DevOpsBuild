/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package DevOpsGradleTest;

import com.google.common.net.InternetDomainName;
import com.mitchtalmadge.asciidata.graph.ASCIIGraph;

import org.checkerframework.checker.units.qual.s;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        InternetDomainName owner =
        InternetDomainName.from("blog.overops.com").topPrivateDomain(); // returns takipi.com
        InternetDomainName.isValid("takipi.monsters");

        System.out.println(owner.toString());


        String graph = ASCIIGraph.fromSeries(new double[] { 1.0, 2.0, 3.0, 10.0, 7.0, 9.0, 5.0, 4.0 }).plot();  
        System.out.println(graph);

    }
}
