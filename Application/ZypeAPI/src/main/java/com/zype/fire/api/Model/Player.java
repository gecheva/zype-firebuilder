package com.zype.fire.api.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Evgeny Cherkasov on 14.04.2017.
 */

public class Player {
    @SerializedName("_id")
    @Expose
    public String Id;

    @Expose
    public String name;
}
