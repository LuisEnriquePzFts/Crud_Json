package com.example.app_crud_json;

public class Config {
    //Agegado de las direcciones de uestros scripts de el CRUD
    public static final String URL_ADD = "http://192.168.1.67:8090/Android/CRUD/addEmp.php";
    public static final String URL_GET_ALL = "http://192.168.1.67:8090/Android/CRUD/getAllEmp.php";
    public static final String URL_GET_EMP = "http://192.168.1.67:8090/Android/CRUD/getEmp.php?id=";
    public static final String URL_UPDATE_EMP = "http://192.168.1.67:8090/Android/CRUD/updateEmp.php";
    public static final String URL_DELETE_EMP = "http://192.168.1.67:8090/Android/CRUD/deleteEmp.php?id=";

    //Definiendo las constants para ser usadas en los requerimientos a los scripts
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAME = "name";
    public static final String KEY_EMP_DESG = "desg";
    public static final String KEY_EMP_SAL = "salary";

    //Json Tags
    public static final String TAG_JSON_ARRAY = "result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAME = "name";
    public static final String TAG_DESG = "desg";
    public static final String TAG_SAL = "salary";

    public static final String EMP_ID = "emp_id";
}
