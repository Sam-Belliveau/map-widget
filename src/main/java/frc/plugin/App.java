package frc.plugin;

import edu.wpi.first.shuffleboard.api.plugin.Plugin;

import com.google.common.collect.ImmutableList;

import java.util.List;

import edu.wpi.first.shuffleboard.api.plugin.Description;
import edu.wpi.first.shuffleboard.api.widget.WidgetType;
import edu.wpi.first.shuffleboard.api.widget.ComponentType;

@Description(group = "StuyPulse 694", name = "StuyPulse Cheesecake", version="0.0.0", summary="StuyPulse Custom Widgets For Other Teams")

public class App extends Plugin {
    @Override
    @SuppressWarnings("all")
    public List<ComponentType> getComponents() {
        return ImmutableList.of(WidgetType.forAnnotatedWidget(Cheesecake.class));
    }
}
