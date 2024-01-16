// Generated by view binder compiler. Do not edit!
package elapor.application.com.elapor.databinding;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.viewbinding.ViewBinding;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import customfonts.MyTextView;
import elapor.application.com.elapor.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class PelanggaranItemListBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button delete;

  @NonNull
  public final ImageView image;

  @NonNull
  public final MyTextView keterangan;

  @NonNull
  public final Button open;

  @NonNull
  public final MyTextView tanggaljam;

  private PelanggaranItemListBinding(@NonNull LinearLayout rootView, @NonNull Button delete,
      @NonNull ImageView image, @NonNull MyTextView keterangan, @NonNull Button open,
      @NonNull MyTextView tanggaljam) {
    this.rootView = rootView;
    this.delete = delete;
    this.image = image;
    this.keterangan = keterangan;
    this.open = open;
    this.tanggaljam = tanggaljam;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PelanggaranItemListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PelanggaranItemListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.pelanggaran_item_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PelanggaranItemListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.delete;
      Button delete = rootView.findViewById(id);
      if (delete == null) {
        break missingId;
      }

      id = R.id.image;
      ImageView image = rootView.findViewById(id);
      if (image == null) {
        break missingId;
      }

      id = R.id.keterangan;
      MyTextView keterangan = rootView.findViewById(id);
      if (keterangan == null) {
        break missingId;
      }

      id = R.id.open;
      Button open = rootView.findViewById(id);
      if (open == null) {
        break missingId;
      }

      id = R.id.tanggaljam;
      MyTextView tanggaljam = rootView.findViewById(id);
      if (tanggaljam == null) {
        break missingId;
      }

      return new PelanggaranItemListBinding((LinearLayout) rootView, delete, image, keterangan,
          open, tanggaljam);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
