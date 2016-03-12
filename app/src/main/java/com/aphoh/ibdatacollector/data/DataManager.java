package com.aphoh.ibdatacollector.data;

import android.content.Context;
import com.couchbase.lite.CouchbaseLiteException;
import com.couchbase.lite.Database;
import com.couchbase.lite.Manager;
import com.couchbase.lite.android.AndroidContext;
import com.couchbase.lite.util.Log;
import java.io.IOException;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton public class DataManager {
  public static final String DB_NAME = "Data-Sync";

  private final Context context;

  @Inject public DataManager(Context context) {
    this.context = context;
  }

  public static final String TAG = DataManager.class.getSimpleName();

  private Manager getManager() throws IOException, CouchbaseLiteException {
    Manager m = new Manager(new AndroidContext(context), Manager.DEFAULT_OPTIONS);
    Database db = m.getDatabase(DB_NAME);

  }

  private void initDebugLogging() {
    Manager.enableLogging(TAG, Log.VERBOSE);
    Manager.enableLogging(Log.TAG_SYNC_ASYNC_TASK, Log.VERBOSE);
    Manager.enableLogging(Log.TAG_SYNC, Log.VERBOSE);
    Manager.enableLogging(Log.TAG_QUERY, Log.VERBOSE);
  }
}
