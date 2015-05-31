package Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;

public class DBSurvey extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "SurveyDatabase";
    private static final String TABLE_SURVEY = "survey";
    private static final String KEY_NAME_REFREE = "refree";
    private static final String KEY_NAME = "name";
    private static final String KEY_ADDRESS = "address";
    private static final String KEY_ID = "survey_id";
    private static final String KEY_EMAIL = "email";
    private static final String KEY_PHONE = "phone";
    private static final String KEY_SIXTH = "ownership";
    private static final String KEY_SIXTH_OTHER = "ownership_other";
    private static final String KEY_RENT = "rent";
    private static final String KEY_SEVENTH = "time";
    private static final String KEY_SEVENTH_OTHER = "time_other";
    private static final String KEY_EIGHTH = "who";
    private static final String KEY_EIGHTH_OTHER = "who_other";
    private static final String KEY_NINTH = "electricity";
    private static final String KEY_NINTH_OTHER = "electricity_other";
    private static final String KEY_TENTH = "water_problems";
    //private static final String KEY_TENTH_OTHER = "water_problems_other";
    private static final String KEY_ELEVENTH = "landlord_fights";
    //private static final String KEY_ELEVENTH_OTHER = "landlord_fights_other";
    private static final String KEY_TWELVTH = "living_conditions";
    //private static final String KEY_TWELVTH_OTHER = "living_conditions_other";
    private static final String KEY_THIRTEENTH = "facilities";
    //private static final String KEY_THIRTEENTH_OTHER = "facilities_other";
    private static final String KEY_ROOMS = "rooms";
    private static final String KEY_FIFTEENTH = "neighbours";
    //private static final String KEY_FIFTEENTH_OTHER = "neighbours_other";
    private static final String KEY_SIXTEENTH = "locality";
    //private static final String KEY_SIXTEENTH_OTHER = "locality_other";
    private static final String KEY_REMARKS = "remarks";






    private final ArrayList<DBSurveyBean> YC_list = new ArrayList<DBSurveyBean>();


    public DBSurvey(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_SURVEY_TABLE = "CREATE TABLE " + TABLE_SURVEY + "("
                + KEY_ID + " TEXT PRIMARY KEY," + KEY_NAME_REFREE + " TEXT,"+ KEY_NAME + " TEXT,"+KEY_ADDRESS + " TEXT,"
                + KEY_EMAIL +" TEXT," + KEY_PHONE + " TEXT," + KEY_SIXTH + " TEXT," + KEY_SIXTH_OTHER + " TEXT,"+ KEY_RENT + " TEXT," + KEY_SEVENTH + " TEXT,"
                + KEY_SEVENTH_OTHER + " TEXT,"+ KEY_EIGHTH + " TEXT," + KEY_EIGHTH_OTHER + " TEXT,"+ KEY_NINTH + " TEXT,"
                + KEY_NINTH_OTHER + " TEXT," + KEY_TENTH + " TEXT," + KEY_ELEVENTH + " TEXT," + KEY_TWELVTH + " TEXT,"
                + KEY_THIRTEENTH + " TEXT," + KEY_ROOMS + " TEXT," + KEY_FIFTEENTH + " TEXT," + KEY_SIXTEENTH + " TEXT,"
                + KEY_REMARKS + " TEXT"+")";

        db.execSQL(CREATE_SURVEY_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_SURVEY);
        onCreate(db);
    }
    public void addSurvey(DBSurveyBean lb)
    {
        try {
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues values = new ContentValues();
            values.put(KEY_NAME, lb.getName());
            values.put(KEY_NAME_REFREE, lb.getName_refree());
            values.put(KEY_ADDRESS, lb.getAddress());
            values.put(KEY_EMAIL, lb.getEmail());
            values.put(KEY_PHONE, lb.getPhone());
            values.put(KEY_SIXTH, lb.getSixth());
            values.put(KEY_SIXTH_OTHER, lb.getOther_sixth());
            values.put(KEY_RENT, lb.getRent());
            values.put(KEY_SEVENTH, lb.getSeven());
            values.put(KEY_SEVENTH_OTHER, lb.getOther_seven());
            values.put(KEY_EIGHTH, lb.getEighth());
            values.put(KEY_EIGHTH_OTHER, lb.getOther_eighth());
            values.put(KEY_NINTH, lb.getNinth());
            values.put(KEY_NINTH_OTHER, lb.getOther_ninth());
            values.put(KEY_TENTH, lb.getTenth());
            //values.put(KEY_TENTH_OTHER, lb.getOther_tenth());
            values.put(KEY_ELEVENTH, lb.getEleventh());
            //values.put(KEY_ELEVENTH_OTHER, lb.getOther_eleventh());
            values.put(KEY_TWELVTH, lb.getTwelvth());
            //values.put(KEY_TWELVTH_OTHER, lb.getOther_twelvth());
            values.put(KEY_THIRTEENTH, lb.getThirteenth());
            //values.put(KEY_THIRTEENTH_OTHER, lb.getOther_thirteenth());
            values.put(KEY_ROOMS, lb.getRooms());
            values.put(KEY_FIFTEENTH, lb.getFifteenth());
            //values.put(KEY_FIFTEENTH_OTHER, lb.getOther_fifteenth());
            values.put(KEY_SIXTEENTH, lb.getSixteenth());
            //values.put(KEY_SIXTEENTH_OTHER, lb.getOther_sixteenth());
            values.put(KEY_REMARKS, lb.getComments());

            db.insert(TABLE_SURVEY, null, values);
            db.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            Log.e("99999999999999999999999999999999999999999", "9999999999999999999999999999999999999999");
            e.printStackTrace();
        }
    }


    public ArrayList<DBSurveyBean> Get_Survey() {
        try {
            YC_list.clear();
            String selectQuery = "SELECT  * FROM " + TABLE_SURVEY;

            SQLiteDatabase db = this.getWritableDatabase();
            Cursor cursor = db.rawQuery(selectQuery, null);
            if (cursor.moveToFirst()) {
                do {
                    DBSurveyBean dbcBean = new DBSurveyBean();

                    dbcBean.setName_refree(cursor.getString(0));
                    dbcBean.setName(cursor.getString(1));
                    dbcBean.setAddress(cursor.getString(2));
                    dbcBean.setEmail(cursor.getString(3));
                    dbcBean.setPhone(cursor.getString(4));
                    dbcBean.setSixth(cursor.getString(5));
                    dbcBean.setOther_sixth(cursor.getString(6));
                    dbcBean.setRent(cursor.getString(7));
                    dbcBean.setSeven(cursor.getString(8));
                    dbcBean.setOther_seven(cursor.getString(9));
                    dbcBean.setEighth(cursor.getString(10));
                    dbcBean.setOther_eighth(cursor.getString(11));
                    dbcBean.setNinth(cursor.getString(12));
                    dbcBean.setOther_ninth(cursor.getString(13));
                    dbcBean.setTenth(cursor.getString(14));
                    //dbcBean.setOther_tenth(cursor.getString(15));
                    dbcBean.setEleventh(cursor.getString(15));
                    //dbcBean.setOther_eleventh(cursor.getString(17));
                    dbcBean.setTwelvth(cursor.getString(16));
                    //dbcBean.setOther_twelvth(cursor.getString(19));
                    dbcBean.setThirteenth(cursor.getString(17));
                    //dbcBean.setOther_thirteenth(cursor.getString(21));
                    dbcBean.setRooms(cursor.getString(18));

                    dbcBean.setFifteenth(cursor.getString(19));
                    //dbcBean.setOther_fifteenth(cursor.getString(25));
                    dbcBean.setSixteenth(cursor.getString(20));
                    dbcBean.setComments(cursor.getString(21));
                    //dbcBean.setOther_sixteenth(cursor.getString(27));

                    YC_list.add(dbcBean);
                } while (cursor.moveToNext());
            }

            // return contact list
            cursor.close();
            db.close();
            return YC_list;
        } catch (Exception e) {
            // TODO: handle exception
            Log.e("=========================================================@@@@@@@@@@@@@@@@@", "" +"");
        }

        return YC_list;
    }

}
