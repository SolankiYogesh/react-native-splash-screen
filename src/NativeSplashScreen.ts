import { TurboModule, TurboModuleRegistry } from "react-native";

export interface Spec extends TurboModule {
  hide(): void;
  show(): void;
}

export default TurboModuleRegistry.getEnforcing<Spec>(
  "RNCSplashScreenSpec"
) as Spec;
