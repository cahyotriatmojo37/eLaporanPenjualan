package elapor.application.com.libs;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

import elapor.application.com.model.pelanggaran;

public class DatabaseHandler extends SQLiteOpenHelper {

	Context context;
	private static final int DATABASE_VERSION = 1;
	private static final String DATABASE_NAMA = "lapas1malang";

	public static final String TABLE_PELANGGARAN = "pelanggaran";

	public DatabaseHandler(Context context) {
		super(context, DATABASE_NAMA, null, DATABASE_VERSION);
		this.context = context;
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	}

	public void createTable() {
		SQLiteDatabase db = this.getWritableDatabase();

		//db.execSQL("DROP TABLE IF EXISTS " + TABLE_PELANGGARAN);
		db.execSQL("CREATE TABLE IF NOT EXISTS " + TABLE_PELANGGARAN + "(" +

				"id INTEGER PRIMARY KEY, " +
				"tanggaljam TEXT, " +

				"nama TEXT," +
				"alamat TEXT," +
				"pasal TEXT," +
				"pidana TEXT," +
				"blok TEXT," +
				"jenis_pelanggaran TEXT," +

				"foto TEXT," +
				"keterangan TEXT," +

				"file TEXT)");

		db.close();
	}

	public void pelanggaranInsertData(pelanggaran data) {

		SQLiteDatabase db = this.getWritableDatabase();
		ContentValues values = new ContentValues();

		values.put("tanggaljam", data.getTanggaljam());

		values.put("nama", data.getNama());
		values.put("alamat", data.getAlamat());
		values.put("pasal", data.getPasal());
		values.put("pidana", data.getPidana());
		values.put("blok", data.getBlok());
		values.put("jenis_pelanggaran", data.getJenis_pelanggaran());

		values.put("foto", data.getFoto());
		values.put("keterangan", data.getKeterangan());

		values.put("file", data.getFile());

		db.insert(TABLE_PELANGGARAN, null, values);

		db.close();
	}

	public void pelanggaranUpdateData(pelanggaran data) {

		SQLiteDatabase db = this.getWritableDatabase();
		ContentValues values = new ContentValues();

		values.put("tanggaljam", data.getTanggaljam());

		values.put("nama", data.getNama());
		values.put("alamat", data.getAlamat());
		values.put("pasal", data.getPasal());
		values.put("pidana", data.getPidana());
		values.put("blok", data.getBlok());
		values.put("jenis_pelanggaran", data.getJenis_pelanggaran());

		values.put("foto", data.getFoto());
		values.put("keterangan", data.getKeterangan());

		values.put("file", data.getFile());

		db.update(TABLE_PELANGGARAN, values, "id=?", new String[] { String.valueOf(data.getId())});
		db.close();
	}

	public void pelanggaranDeleteData(pelanggaran data) {
		SQLiteDatabase db = this.getWritableDatabase();
		db.delete(TABLE_PELANGGARAN, "id=?", new String[] { String.valueOf(data.getId())});
		db.close();
	}

	public ArrayList<pelanggaran> pelanggaranListData() {

		ArrayList<pelanggaran> result = new ArrayList<>();
		try {
			String sql = "SELECT * FROM " + TABLE_PELANGGARAN + " ORDER BY id DESC LIMIT 0, 10";
			SQLiteDatabase db = this.getReadableDatabase();
			Cursor cursor = db.rawQuery(sql, null);
			if(cursor.getCount() > 0) {
				cursor.moveToFirst();
				for(int i=0; i<cursor.getCount(); i++) {
					pelanggaran item = new pelanggaran(
							cursor.getInt(0),
							cursor.getString(1),

							cursor.getString(2),
							cursor.getString(3),
							cursor.getString(4),
							cursor.getString(5),
							cursor.getString(6),
							cursor.getString(7),

							cursor.getString(8),
							cursor.getString(9)
					);
					item.setFile(cursor.getString(10));
					result.add(item);
					cursor.moveToNext();
				}
			}
			cursor.close();
			db.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}


}
