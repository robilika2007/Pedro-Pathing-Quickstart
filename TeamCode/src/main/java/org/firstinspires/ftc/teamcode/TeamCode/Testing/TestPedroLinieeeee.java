package org.firstinspires.ftc.teamcode.TeamCode.Testing;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.pedroPathing.follower.Follower;
import org.firstinspires.ftc.teamcode.pedroPathing.pathGeneration.BezierCurve;
import org.firstinspires.ftc.teamcode.pedroPathing.pathGeneration.Path;
import org.firstinspires.ftc.teamcode.pedroPathing.pathGeneration.Point;

@TeleOp
@Config
public class TestPedroLinieeeee extends LinearOpMode {
    Follower follower;
    Path path;

    public static Point point1;
    public static Point point2;
//    public static Point point3;
//    public static Point point4;

    @Override
    public void runOpMode() throws InterruptedException {
        follower = new Follower(hardwareMap);
        path = new Path(new BezierCurve(point1, point2));
        waitForStart();
        follower.followPath(path);

        while (opModeIsActive()) {
            follower.update();
        }
    }
}
