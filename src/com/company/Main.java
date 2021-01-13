package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        String[] s = new String[]{"роль1: олазщшфлоыа0хуц", "роль1: аофщшкопащшцыуал392к", "роль2: 48320агроцц,,,влй3", "роль2: 4893гкjifo4..,:"};
        toPrint(s);

    }

    public static void toPrint(String[] s){
        ArrayList<String> roles = new ArrayList<>();

        for (int i = 0; i < s.length; i++) {
            String str[] = s[i].split(":");
            String role = str[0];
            if (!roles.contains(role)) {
                roles.add(role);
            }
        }

        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < roles.size(); i++) {
            result.add(roles.get(i) + ":");
            int num = 1;
            for (int a = 0; a < s.length; a++) {
                String str[] = s[a].split(":");
                String role = str[0];
                if (role.equals(roles.get(i))) {
                    String replica = num + ")" + s[a].substring(s[a].indexOf(":") + 1);
                    num++;
                    result.add(replica);
                }
            }
            result.add("");
        }
        result.forEach(value -> System.out.println(value));
    }
}
