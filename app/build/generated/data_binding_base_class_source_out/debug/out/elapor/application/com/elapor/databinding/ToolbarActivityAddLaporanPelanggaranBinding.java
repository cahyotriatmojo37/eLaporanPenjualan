// Generated by view binder compiler. Do not edit!
package elapor.application.com.elapor.databinding;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.viewbinding.ViewBinding;
import android.widget.ImageView;
import elapor.application.com.elapor.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ToolbarActivityAddLaporanPelanggaranBinding implements ViewBinding {
  @NonNull
  private final Toolbar rootView;

  @NonNull
  public final ImageView back;

  @NonNull
  public final Toolbar toolbar;

  private ToolbarActivityAddLaporanPelanggaranBinding(@NonNull Toolbar rootView,
      @NonNull ImageView back, @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.back = back;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public Toolbar getRoot() {
    return rootView;
  }

  @NonNull
  public static ToolbarActivityAddLaporanPelanggaranBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ToolbarActivityAddLaporanPelanggaranBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.toolbar_activity_add_laporan_pelanggaran, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ToolbarActivityAddLaporanPelanggaranBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back;
      ImageView back = rootView.findViewById(id);
      if (back == null) {
        break missingId;
      }

      Toolbar toolbar = (Toolbar) rootView;

      return new ToolbarActivityAddLaporanPelanggaranBinding((Toolbar) rootView, back, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
