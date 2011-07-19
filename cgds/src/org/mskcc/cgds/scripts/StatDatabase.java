package org.mskcc.cgds.scripts;

import org.mskcc.cgds.dao.*;
import org.mskcc.cgds.util.DatabaseProperties;

public class StatDatabase {

    public static void main(String[] args) throws DaoException {
        statDb();
    }

    public static void statDb() {
        DatabaseProperties dbProperties = DatabaseProperties.getInstance();
        String host = dbProperties.getDbHost();
        String userName = dbProperties.getDbUser();
        String password = dbProperties.getDbPassword();
        String database = dbProperties.getDbName();
        System.out.println ("Host:  " + host);
        System.out.println ("User Name:  " + userName);
        System.out.println ("Password:  " + password);
        System.out.println ("Database:  " + database);
    }
}