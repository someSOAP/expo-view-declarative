import { requireNativeViewManager } from 'expo-modules-core';
import * as React from 'react';

import { ExpoViewDeclarativeViewProps } from './ExpoViewDeclarative.types';

const NativeView: React.ComponentType<ExpoViewDeclarativeViewProps> =
  requireNativeViewManager('ExpoViewDeclarative');

export default function ExpoViewDeclarativeView(props: ExpoViewDeclarativeViewProps) {
  return <NativeView {...props} />;
}
