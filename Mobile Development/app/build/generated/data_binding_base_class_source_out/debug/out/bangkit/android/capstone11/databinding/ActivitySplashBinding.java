// Generated by view binder compiler. Do not edit!
package bangkit.android.capstone11.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import bangkit.android.capstone11.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import pl.droidsonroids.gif.GifImageView;

public final class ActivitySplashBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final GifImageView gifImageView;

  private ActivitySplashBinding(@NonNull ConstraintLayout rootView,
      @NonNull GifImageView gifImageView) {
    this.rootView = rootView;
    this.gifImageView = gifImageView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySplashBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySplashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_splash, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySplashBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.gifImageView;
      GifImageView gifImageView = ViewBindings.findChildViewById(rootView, id);
      if (gifImageView == null) {
        break missingId;
      }

      return new ActivitySplashBinding((ConstraintLayout) rootView, gifImageView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
