package lab4;

import java.util.ArrayList;

public class StarmanOrganises {

    private ArrayList<RemoteControllable> controllables = new ArrayList<>();

    public void addControllable(Object o) {
        if (o instanceof RemoteControllable) {
            controllables.add((RemoteControllable) o);
        }
    }

    public void getAllStatusReports() {
        for (RemoteControllable c : controllables) {
            System.out.println(c.getStatusReport());
        }
    }
}
