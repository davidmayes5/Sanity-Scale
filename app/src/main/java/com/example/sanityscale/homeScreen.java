package com.example.sanityscale;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 1, 15},
        bv = {1, 0, 3},
        k = 1,
        d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014¨\u0006\t"},
        d2 = {"Lcom/example/sanityscale/homeScreen;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "configureSettingsButton", "", "configureWeeklyAvgButton", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"}
)
public final class homeScreen extends AppCompatActivity {
    private HashMap _$_findViewCache;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(-1300031);
        this.configureWeeklyAvgButton();
        this.configureSettingsButton();
    }

    public final void configureWeeklyAvgButton() {
        View var10000 = this.findViewById(-1000066);
        if (var10000 == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.Button");
        } else {
            Button weeklyAvgButton = (Button)var10000;
            weeklyAvgButton.setOnClickListener((OnClickListener)(new OnClickListener() {
                public void onClick(@NotNull View p0) {
                    Intrinsics.checkParameterIsNotNull(p0, "p0");
                    Intent intent = new Intent((Context)homeScreen.this, GraphScreen.class);
                    homeScreen.this.startActivity(intent);
                }
            }));
        }
    }

    public final void configureSettingsButton() {
        View var10000 = this.findViewById(-1000193);
        if (var10000 == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.Button");
        } else {
            Button settingsButton = (Button)var10000;
            settingsButton.setOnClickListener((OnClickListener)(new OnClickListener() {
                public void onClick(@NotNull View p0) {
                    Intrinsics.checkParameterIsNotNull(p0, "p0");
                    Intent intent = new Intent((Context)homeScreen.this, SettingsScreen.class);
                    homeScreen.this.startActivity(intent);
                }
            }));
        }
    }

    public View _$_findCachedViewById(int var1) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }

        View var2 = (View)this._$_findViewCache.get(var1);
        if (var2 == null) {
            var2 = this.findViewById(var1);
            this._$_findViewCache.put(var1, var2);
        }

        return var2;
    }

    public void _$_clearFindViewByIdCache() {
        if (this._$_findViewCache != null) {
            this._$_findViewCache.clear();
        }

    }
}
