// Generated by view binder compiler. Do not edit!
package bangkit.android.capstone11.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import bangkit.android.capstone11.R;
import bangkit.android.capstone11.ui.custom.CustomEditText;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityUpdateBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView avaUser;

  @NonNull
  public final BottomNavigationView bottomBar;

  @NonNull
  public final ImageView btnBack;

  @NonNull
  public final Button btnSave;

  @NonNull
  public final CustomEditText edtUsername;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final View topBar;

  @NonNull
  public final TextView tvAddKids;

  @NonNull
  public final TextView tvFullName;

  private ActivityUpdateBinding(@NonNull ConstraintLayout rootView, @NonNull TextView avaUser,
      @NonNull BottomNavigationView bottomBar, @NonNull ImageView btnBack, @NonNull Button btnSave,
      @NonNull CustomEditText edtUsername, @NonNull ProgressBar progressBar, @NonNull View topBar,
      @NonNull TextView tvAddKids, @NonNull TextView tvFullName) {
    this.rootView = rootView;
    this.avaUser = avaUser;
    this.bottomBar = bottomBar;
    this.btnBack = btnBack;
    this.btnSave = btnSave;
    this.edtUsername = edtUsername;
    this.progressBar = progressBar;
    this.topBar = topBar;
    this.tvAddKids = tvAddKids;
    this.tvFullName = tvFullName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityUpdateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityUpdateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_update, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityUpdateBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ava_user;
      TextView avaUser = ViewBindings.findChildViewById(rootView, id);
      if (avaUser == null) {
        break missingId;
      }

      id = R.id.bottom_bar;
      BottomNavigationView bottomBar = ViewBindings.findChildViewById(rootView, id);
      if (bottomBar == null) {
        break missingId;
      }

      id = R.id.btn_back;
      ImageView btnBack = ViewBindings.findChildViewById(rootView, id);
      if (btnBack == null) {
        break missingId;
      }

      id = R.id.btn_save;
      Button btnSave = ViewBindings.findChildViewById(rootView, id);
      if (btnSave == null) {
        break missingId;
      }

      id = R.id.edt_username;
      CustomEditText edtUsername = ViewBindings.findChildViewById(rootView, id);
      if (edtUsername == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.top_bar;
      View topBar = ViewBindings.findChildViewById(rootView, id);
      if (topBar == null) {
        break missingId;
      }

      id = R.id.tv_add_kids;
      TextView tvAddKids = ViewBindings.findChildViewById(rootView, id);
      if (tvAddKids == null) {
        break missingId;
      }

      id = R.id.tv_full_name;
      TextView tvFullName = ViewBindings.findChildViewById(rootView, id);
      if (tvFullName == null) {
        break missingId;
      }

      return new ActivityUpdateBinding((ConstraintLayout) rootView, avaUser, bottomBar, btnBack,
          btnSave, edtUsername, progressBar, topBar, tvAddKids, tvFullName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
