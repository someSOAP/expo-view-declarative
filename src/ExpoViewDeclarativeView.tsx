import { requireNativeViewManager } from 'expo-modules-core';
import * as React from 'react';
import { ViewProps } from "react-native";


interface ExpoViewDeclarativeViewProps extends ViewProps {
  btnText: string;
}

const NativeView: React.ComponentType<ExpoViewDeclarativeViewProps> =
  requireNativeViewManager('ExpoViewDeclarative');

export default function ExpoViewDeclarativeView(props: ExpoViewDeclarativeViewProps) {
  return <NativeView {...props} />;
}
