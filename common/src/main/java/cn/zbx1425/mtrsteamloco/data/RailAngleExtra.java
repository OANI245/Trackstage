package cn.zbx1425.mtrsteamloco.data;

import cn.zbx1425.mtrsteamloco.Main;
import org.mtr.core.tool.Angle;

public interface RailAngleExtra {
    Angle _fromDegrees(double degrees);

    Angle _fromRadians(double radians);

    void setRadians(double radians);

    static Angle fromDegrees(double degrees) {
        Angle result = ((RailAngleExtra) (Object) Angle.S)._fromDegrees(degrees);
        return result;
    }

    static Angle fromRadians(double radians) {
        Angle result = ((RailAngleExtra) (Object) Angle.S)._fromRadians(radians);
        return result;
    }
}